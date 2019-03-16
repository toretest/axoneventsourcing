package no.techpros.axiseventsource.demo.event;

import no.techpros.axiseventsource.demo.domain.Status;

public class AccountHeldEvent extends BaseEvent<String> {

    public final Status status;

    public AccountHeldEvent(String id, Status status) {
        super(id);
        this.status = status;
    }
}
