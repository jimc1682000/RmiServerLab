# RmiServerLab
This is a Java RMI Server Lab.
A RMI Server need to integrate to the RMI Client,therefore you might want to get Java RMI Client Lab as well.
Get RmiClientLab Here:
https://github.com/jimc1682000/RmiClientLab
Also notice that when you want to use my project in Eclipse, you need to create a new "Run Configurations", and setting VM arguments as

"-Djava.security.policy=file:${workspace_loc}/RMIServerLab/security.policy -Djava.rmi.server.codebase=file:${workspace_loc}/RMIServerLab/bin/tw/jimmy/lab"
(without "")

in the Arguments tab.