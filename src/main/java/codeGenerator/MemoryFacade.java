package codeGenerator;

public class MemoryFacade {

    private Memory memory;

    public MemoryFacade(Memory memory) {
        this.memory = memory;
    }

    public Memory getMemory() {
        return memory;
    }

    public int getDateAddress() {
        return getMemory().getDateAddress();
    }
}
