# Calculador de preu Volkswagen Grand California
![Imatge del vehicle](https://github.com/mohamedkoujil/exercici5VWAmpliat/assets/74406781/6f705fbd-7886-496d-ad31-9ae7f3df46e2)


## Descripció del projecte <a id="criteris" />
La funció principal d'aquest programa és calcular el preu d'un Volkswagen Grand California basant-se en base als següents criteris:
- Kilometratge
- Any de fabricació
- Accessoris

### Menu principal <a id="menuPrincipal" />
- El programa comença amb un menu principal on s'escull el model del vehicle.
  ![Menu principal](https://github.com/mohamedkoujil/exercici5VWAmpliat/assets/74406781/93f9087e-2abd-42ad-81bb-071a726e41bc)
  
- Es fan unes preguntes i es calcula el preu final
  ![Preguntes i càlcul de preu final](https://github.com/mohamedkoujil/exercici5VWAmpliat/assets/74406781/53238c18-00df-4342-91a5-c9f218466441)

## Funcions principals <a id="funcionsPrincipals" />
1. [**preuBase**](https://github.com/mohamedkoujil/exercici5VWAmpliat/assets/74406781/2b89cfcb-9e58-4ee1-96ff-964e270a506d): Aquesta funció calcula el preu base segons el model del vehicle
2. [**calculPerdua**](https://github.com/mohamedkoujil/exercici5VWAmpliat/assets/74406781/0b0bcfb4-7228-47c0-9ffd-b05f442cfdbc): Aquesta funció calcula la pèrdua de diners segons els [criteris](#criteris) mencionats anteriorment
3. [**preuFinal**](https://github.com/mohamedkoujil/exercici5VWAmpliat/assets/74406781/52b56146-9646-4824-949c-82de51114a73): Calcula el preu final restant el preu base amb la pèrdua

## Altres funcions <a id="funcionsExtra" />
- [Verificació de dades](/tree/main/src/main/kotlin/Utilities.kt): Archiu el qual conté els mètodes de verificació de tipus de dades, necessàries pel bon funcionament del programa
- [Canvi Colors](/tree/main/src/main/kotlin/ConsoleColors.kt): Archiu que conté diferentes colors per donar color al menú principal, errors i advertències
