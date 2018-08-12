package net.aslangoo.conditionl;

public class WindowsListServcie implements ListService {
    @Override
    public String showListCmd() {
        return "dir";
    }
}
