package mts_homework.Delegate;

import lombok.extern.java.Log;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.springframework.stereotype.Component;

import java.util.logging.Level;

@Log
@Component
public class InProcessNotifyStatus {

    public void execute(DelegateExecution execution) throws Exception {
        log.log(Level.INFO, "executed InProcessNotifyStatus: {}", execution);
        String status = (String) execution.getVariableLocal(Constants.STATUS);
    }
}
