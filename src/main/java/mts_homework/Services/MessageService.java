package mts_homework.Services;

import org.springframework.kafka.annotation.KafkaListener;

import java.lang.classfile.constantpool.ConstantValueEntry;
import java.util.Map;

public class MessageService {
    @KafkaListener(topics = "start-process", groupId = "consumer-1")
    public void startProcess(StartMessage msg) {
    //    Map<String, Object> variables = Map.of(ConstantValueEntry.)
    }

    @KafkaListener(topics = "response", groupId = "consumer-1")
    public void response(ServiceResponse msg) {
        runtimeService.correlateMessage(msg.getMessageCode(), msg.getId(), msg.getVariables);
    }

}
