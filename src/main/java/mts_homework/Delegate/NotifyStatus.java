package mts_homework.Delegate;

import lombok.extern.java.Log;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;
import mts_homework.Delegate.Constants;

import java.util.logging.Level;
@Log
@Component
public class NotifyStatus implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) throws Exception {
        log.log(Level.INFO, "executed NotifyStatus: {}", execution);
        String status = (String) execution.getVariableLocal(Constants.STATUS);
        switch (status) {
            case "COMPLETED":
                break;
            case "ASSEMBLE_FAIL":
                break;
            case "NO_PRODUCT_AVAILABLE":
                break;
            case "DELIVERY_FAIL":
                break;
            case "PACKAGING_FAIL":
                break;
        }
    }
}
