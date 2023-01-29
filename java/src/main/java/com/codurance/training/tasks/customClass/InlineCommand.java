package com.codurance.training.tasks.customClass;

public class InlineCommand {
    private Command command;
    
    _commandRest:CommandRest = None

    def __init__(self, commandLineStr:str) -> None:

        commandLineStr      = commandLineStr.strip()
        commandLineSplited  = commandLineStr.split(" ", 1)
        commandStr          = commandLineSplited[0]
        self._command       = Command(type=CommandType(commandStr=commandStr))

        if len(commandLineSplited) > 1:
            self._commandRest = self._command.createCommandRest(commandRestStr=commandLineSplited[1])

    def execute(self, programDatas:ProgramDatas, console:Console) -> None:
        self._command.execute(commandRest=self._commandRest, programDatas=programDatas, console=console)

    def loopContinue(self) -> LoopContinue:
        return self._command.loopContinue()
}
