package no.techpros.axiseventsource.demo.event;

import no.techpros.axiseventsource.demo.domain.Status;

public class AccountActivatedEvent extends BaseEvent<String> {

    public final Status status;

    public AccountActivatedEvent(String id, Status status) {
        super(id);
        this.status = status;
    }
}
