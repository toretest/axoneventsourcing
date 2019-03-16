package no.techpros.axiseventsource.demo.endpoint;

import java.util.List;

public interface AccountQueryService {
    public List<Object> listEventsForAccount(String accountNumber);
}
