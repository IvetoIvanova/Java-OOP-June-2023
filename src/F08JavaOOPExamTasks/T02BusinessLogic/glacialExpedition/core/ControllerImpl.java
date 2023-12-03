package F08JavaOOPExamTasks.T02BusinessLogic.glacialExpedition.core;

import F08JavaOOPExamTasks.T02BusinessLogic.glacialExpedition.common.ConstantMessages;
import F08JavaOOPExamTasks.T02BusinessLogic.glacialExpedition.common.ExceptionMessages;
import F08JavaOOPExamTasks.T02BusinessLogic.glacialExpedition.models.explorers.AnimalExplorer;
import F08JavaOOPExamTasks.T02BusinessLogic.glacialExpedition.models.explorers.Explorer;
import F08JavaOOPExamTasks.T02BusinessLogic.glacialExpedition.models.explorers.GlacierExplorer;
import F08JavaOOPExamTasks.T02BusinessLogic.glacialExpedition.models.explorers.NaturalExplorer;
import F08JavaOOPExamTasks.T02BusinessLogic.glacialExpedition.models.mission.Mission;
import F08JavaOOPExamTasks.T02BusinessLogic.glacialExpedition.models.mission.MissionImpl;
import F08JavaOOPExamTasks.T02BusinessLogic.glacialExpedition.models.states.State;
import F08JavaOOPExamTasks.T02BusinessLogic.glacialExpedition.models.states.StateImpl;
import F08JavaOOPExamTasks.T02BusinessLogic.glacialExpedition.repositories.ExplorerRepository;
import F08JavaOOPExamTasks.T02BusinessLogic.glacialExpedition.repositories.StateRepository;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ControllerImpl implements Controller {
    private ExplorerRepository explorerRepository;
    private StateRepository stateRepository;

    private int exploredStates;

    public ControllerImpl() {
        explorerRepository = new ExplorerRepository();
        stateRepository = new StateRepository();
        exploredStates = 0;
    }

    @Override
    public String addExplorer(String type, String explorerName) {
        Explorer explorer;
        switch (type) {
            case "AnimalExplorer":
                explorer = new AnimalExplorer(explorerName);
                break;
            case "GlacierExplorer":
                explorer = new GlacierExplorer(explorerName);
                break;
            case "NaturalExplorer":
                explorer = new NaturalExplorer(explorerName);
                break;
            default:
                throw new IllegalArgumentException(ExceptionMessages.EXPLORER_INVALID_TYPE);
        }
        explorerRepository.add(explorer);
        return String.format(ConstantMessages.EXPLORER_ADDED, type, explorerName);
    }

    @Override
    public String addState(String stateName, String... exhibits) {
        State state = new StateImpl(stateName);
        Collections.addAll(state.getExhibits(), exhibits);
        stateRepository.add(state);
        return String.format(ConstantMessages.STATE_ADDED, stateName);
    }

    @Override
    public String retireExplorer(String explorerName) {
        Explorer explorerToRetire = explorerRepository.byName(explorerName);
        if (explorerToRetire == null) {
            throw new IllegalArgumentException(String.format(ExceptionMessages.EXPLORER_DOES_NOT_EXIST, explorerName));
        }
        explorerRepository.remove(explorerToRetire);
        return String.format(ConstantMessages.EXPLORER_RETIRED, explorerName);
    }

    @Override
    public String exploreState(String stateName) {
        List<Explorer> validExplorers = explorerRepository
                .getCollection()
                .stream()
                .filter(e -> e.getEnergy() > 50)
                .collect(Collectors.toList());

        if (validExplorers.isEmpty()) {
            throw new IllegalArgumentException(ExceptionMessages.STATE_EXPLORERS_DOES_NOT_EXISTS);
        }

        State stateToExplore = stateRepository.byName(stateName);
        Mission mission = new MissionImpl();
        mission.explore(stateToExplore, validExplorers);

        long countOfRetireExplorers = validExplorers
                .stream()
                .filter(e -> e.getEnergy() == 0)
                .count();

        exploredStates++;
        return String.format(ConstantMessages.STATE_EXPLORER, stateName, countOfRetireExplorers);
    }

    @Override
    public String finalResult() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(ConstantMessages.FINAL_STATE_EXPLORED, exploredStates));
        sb.append(System.lineSeparator());
        sb.append(ConstantMessages.FINAL_EXPLORER_INFO);
        sb.append(System.lineSeparator());

        for (Explorer explorer : explorerRepository.getCollection()) {
            sb.append(String.format(ConstantMessages.FINAL_EXPLORER_NAME, explorer.getName()));
            sb.append(System.lineSeparator());
            sb.append(String.format(ConstantMessages.FINAL_EXPLORER_ENERGY, explorer.getEnergy()));
            sb.append(System.lineSeparator());
            if (explorer.getSuitcase().getExhibits().isEmpty()) {
                sb.append(String.format(ConstantMessages.FINAL_EXPLORER_SUITCASE_EXHIBITS, "None"));
                sb.append(System.lineSeparator());
            } else {
                sb.append(String.format(ConstantMessages.FINAL_EXPLORER_SUITCASE_EXHIBITS,
                        String.join(ConstantMessages.FINAL_EXPLORER_SUITCASE_EXHIBITS_DELIMITER, explorer.getSuitcase().getExhibits())))
                        .append(System.lineSeparator());
            }
        }

        return sb.toString().trim();
    }
}
