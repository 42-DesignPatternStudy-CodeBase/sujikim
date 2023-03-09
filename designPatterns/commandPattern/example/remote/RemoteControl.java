package commandPattern.example.remote;
import java.util.*;

public class RemoteControl {
  
    private Map<Integer, ArrayList<Command> > commandMap;
    
    public RemoteControl() {
        commandMap = new HashMap<Integer, ArrayList<Command>>();
    }
    
    public void setCommand(int index, Command onCommand, Command offCommand) {
        ArrayList<Command> commandList = new ArrayList<>();
        commandList.add(onCommand);
        commandList.add(offCommand);
        commandMap.put(index, commandList);
    }
            
    @Override
    public String toString() {
        StringBuilder manual = new StringBuilder("--------------메뉴얼------------\n");
        commandMap.forEach((key, commandList) -> {
            
            manual.append(key + ": " );
            for (Command command :commandList) {
            String str = command.toString();
            String commandName = str.substring(str.indexOf(".") + 1, str.indexOf("Command@"));
            
            manual.append(commandName + " ");
            }
            manual.append("\n");
        });
        manual.append("--------------------------------\n");
        return manual.toString();
    }

    public void onButtonWasPushed(int index) {
        try {
            ArrayList<Command> commandSet = commandMap.get(index);
            commandSet.get(0).execute();
        } catch(Exception e) {
            System.out.println("잘못된 요청입니다.");
        }
    }

    public void offButtonWasPushed(int index) {
        try {
            ArrayList<Command> commands = commandMap.get(index);
            commands.get(1).execute();
        } catch(Exception e) {
            System.out.println("잘못된 요청입니다.");
        }
    }
}
