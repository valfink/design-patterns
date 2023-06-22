package org.example;

public class WorkingPersonBuilder extends PersonBuilder<WorkingPersonBuilder> {

    public WorkingPersonBuilder withJob(String job) {
        person.setJob(job);
        return self();
    }

    @Override
    protected WorkingPersonBuilder self() {
        // here no typecasting needed as this class is not generic!
        return this;
    }
}
