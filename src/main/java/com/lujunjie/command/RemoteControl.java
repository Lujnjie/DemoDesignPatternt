package com.lujunjie.command;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    Command undoCommand;

    public RemoteControl() {
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];
        for (int i = 0; i < 7; i++) {
            this.onCommands[i] = new NoCommand();
            this.offCommands[i] = new NoCommand();
        }

        this.undoCommand = new NoCommand();
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        this.onCommands[slot].execute();;
        this.undoCommand = this.offCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        this.offCommands[slot].execute();;
        this.undoCommand = this.onCommands[slot];
    }

    public void undoButtonWasPushed() {
       undoCommand.undo();
    }
}
