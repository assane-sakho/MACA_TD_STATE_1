### 1. Appareil Domotique
    Question 1 : 
    
    A la lecture de ces diagrammes, donnez une explication la plus précise possible du comportement 
    qu'aurait cette application (en utilisant les concepts décrits dans le diagramme de classe).
    
L'appareil est initialement dans le comportement "ÉTEINT".  
L'évènement **allumé** est déclenché, on passe alors dans l'état "ALLUMÉ".   
Depuis l'état "ALLUMÉ", on dispose de l'évènement **démarer** ou **éteindre** :
Lorsque l'évènement **éteindre** est déclenché, on passe dans l'état "ÉTEINT" (l'état terminal du système).   
Quand l'évènement **démarer** est déclenché, on bascule dans l'état "DÉMARRER".  
En étant dans l'état "DÉMARRER" et que l'évènement **arreter** survienne, on passe dans l'état "ARRETER". 
Ainsi, depuis l'état "ARRETER" l'évènement **démarrer** est disponible pour retourner dans l'état "DÉMARRER".  
Mais encore, l'évènement **éteindre** peut être déclenché pour retourner dans l'état "ETEINT".
   
