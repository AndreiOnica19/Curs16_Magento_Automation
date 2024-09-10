package test.utils;

import lombok.extern.log4j.Log4j2;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

@Log4j2
public class Retry implements IRetryAnalyzer {

    private int count = 0;

    @Override
    public boolean retry(ITestResult iTestResult) {

        if(iTestResult.getStatus() == ITestResult.FAILURE && this.count < 2) {
                this.count++;
                log.info("Retrying test {} for the {} time", iTestResult.getName(), count);
                return true;
            }
        return false;
    }
}
