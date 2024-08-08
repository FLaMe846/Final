package mts_homework.Consumers;

import lombok.Data;
import org.camunda.bpm.engine.RuntimeService;

@Data
public class ReceiveMessage {
    private final RuntimeService runtimeService;

}
