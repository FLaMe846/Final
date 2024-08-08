package mts_homework.Delegate;

import lombok.extern.java.Log;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.logging.Level;

@Log
@Component
public class CheckProductAvailability implements JavaDelegate {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        log.log(Level.INFO,"executed CheckProductAvailability: {}", execution);

        execution.setVariableLocal(ConstValues.Ava);
    }
}
