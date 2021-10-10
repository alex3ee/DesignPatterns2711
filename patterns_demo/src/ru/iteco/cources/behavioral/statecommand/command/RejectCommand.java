package ru.iteco.cources.behavioral.statecommand.command;

import ru.iteco.cources.behavioral.statecommand.state.Document;

public class RejectCommand extends Command {
    public RejectCommand(Document document) {
        super(document);
    }

    @Override
    public Document execute() {
        return document.getState().onReject();
    }
}
