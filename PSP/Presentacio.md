---
lang: ca
titlepage: false
toc: false
---

# Programació de Serveis i Processos

## Objectius

D’acord amb la normativa, i els resultats d’aprenentatge establerts en aquesta, els objectius del mòdul de Programació de Serveis i Processos són els següents:

* Utilitzar les les capacitats oferides pel sistema operatiu per a la gestió de processos i fils.
* Programar aplicacions compostes per diversos processos i fils.
* Desenvolupar aplicacions amb capacitats per a comunicar-se i oferir serveis a través d'una xarxa.
* Utilitzar mecanismes de seguretat en el desenvolupament d'aplicacions.
* Aplicar pràctiques de programació segura.
* Aplicar tècniques criptogràfiques en la utilització, emmagatzematge i transmissió d'informació.

## Continguts del mòdul. Unitats didàctiques.

Els continguts del mòdul s’organitzen en les següents unitats didàctiques:

* **U1. Programació Multiprocés**
    Veurem què són els processos, serveis i fils d’execució i com el sistema operatiu treballa amb aquests, així com les principals ordres del sistema operatiu per gestionar-los. També s’abordarà la programació concurrent, paral·lela i distribuïda, la creació i gestió de processos i els mecanismes de comunicació entre ells.

* **U2. Programació multifil**
    En aquesta unitat es tractarà la programació d’aplicacions amb múltiples fils, els recursos que comparteixen, els estats i les llibreries i classes necessàries per a la creació, inicialització, gestió i finalització de fils, així com els mecanismes de sincronització i l’intercanvi d’informació entre ells.

* **U3. Programació de comunicacions en xarxa**
    Estudiarem diferents protocols de comunicació entre aplicacions, i diferents arquitectures d’aplicacions distribuïdes. Veurem les llibreries necessàries per a la programació d’aplicacions en xarxa, i ens centrarem en el mecanisme de sockets per tal d’implementar les comunicacions dins les aplicacions.

* **U4. Generació de serveis en xarxa.**
    En aquesta unitat s’estudiaran els diferents estàndards de comunicació en xarxa a nivell d’aplicació, com telnet, ftp, http, pop3, smtp, i veurem com implementar aquests serveis. En aquesta unitat s’introduirà també el desenvolupament de serveis REST amb els frameworks node.js i Express.js. 

* **U5. Tècniques de programació segura.**
    Algunes comunicacions a través de la xarxa requereixen la seua transmissió de forma segura. En aquesta unitat veurem tècniques per tal de realitzar aquesta protecció de la informació, mitjançant el control d’accessos, privilegis, tècniques criptogràfiques i diferents polítiques de seguretat. Aprendrem a programar amb sockets i comunicacions segures per tal d’encriptar la informació.


## Temporalització de continguts

* Primer Trimestre
    * **U1. Programació Multiprocés**
    * **U2. Programació multifil**
    * **U3. Programació de comunicacions en xarxa**
* Segon Trimestre
    * **Introducció a NodeJS**
    * **U4. Generació de serveis en xarxa.**
    * **U5. Tècniques de programació segura.**

## Com treballarem?

* **Semipresencialitat:**
    * Lectura comprensiva i estudi de la teoria exposada en cada unitat,
    * Lectura de documentació addicional per ampliar coneixements,
    * Realització dels exercicis i les pràctiques guiades que acompanyen la teoría de la unitat,
    * Realització d’activitats i pràctiques de consolidació i reforç
    * Participació en els fòrums de debat de les unitats
    * Realització i lliurament d’Activitats Pràctiques d’Avaluació Continuada (APAC) per a la seua correcció i avaluació dins el termini establert. 

* **Materials**
    * Apunts proporcionats pel professor. De cada unitat didàctica es proporcionaran diversos documents amb les explicacions teòriques i exemples pràctics que contribuïsquen a assolir els objectius de la unitat.
    * Textos d’ampliació i enllaços a articles i documentació oficial relacionats amb cada unitat.
    * Pràctiques i exercicis resolts per reforçar el que s’ha exposat als apunts.
    * Tot aquest material s’oferirà a través de l’aula virtual durant el desenvolupament de cada unitat. 
    * A més, dins l’aula virtual, disposarem d’un fòrum general per comentar aspectes globals del mòdul, i un fòrum per cada unitat didàctica, per tal de resoldre dubtes i tractar aspectes relacionats amb la unitat.

* **Programari**: El programari a utilitzar serà principalment lliure, i se us donaran instruccions en cada unitat per a la seua descàrrega i instal·lació. A grans trets, el programari a utilitzar serà:
    * Ubuntu 20.04/JustiX, com a sistema operatiu de base. Per tal de facilitar-vos el treball, als ordinadors del centre disposeu de la capa de programari JustiX, de la qual teniu informació a https://ieseljust.github.io/justix-focal/ per si voleu instal·lar-la als vostres ordinadors.
    * Visual Studio Code com a editor de codi, que suporta diferents llenguatges, i és bastant ampliable amb extensions. Tot i que serà l’editor de referència, podeu fer ús de NetBeans, Eclipse, o qualsevol altre editor/IDE amb què treballeu còmodament.
    * OpenJDK 11, com entorn de desenvolupament Java, 
    * node.js, com a framework per a la implementació de serveis.
    * El programari més específic, com llibreries i frameworks s’anirà indicant al llarg de les diferents unitats didàctiques.


## Tutoríes

* Tutoríes col·lectives presencials
    * No són obligatòries.
    * Són en grup.
    * Serviran per fer un seguiment del mòdul i explicar les parts més complexes. En elles, també s’orientarà el treball a realitzar i s’aclariran dubtes generals.
    * L’horari de les tutories col·lectives serà:
        * Dimarts, de 13:05 a 14:00
        * Dijous, de 17:35 a 15:30

    * Tutories individuals
        * De forma presencial, podeu consultar directament els dubtes amb el professor.
        * Caldrà concretar cita prèviament, per tal d’organitzar les tutories.
        * L’horari previst d’atenció per a les tutories individualitzades serà:
            * Dilluns(*) i Divendres, de 11:15 a 12:10

## Avaluació

Podreu optar a dos sistemes d’avaluació:

* **Avaluació continuada**: Consisteix al seguiment i realització de les Activitats Pràctiques d’Avaluació Continuada, que suposaran un 70% de la nota final, més la realització d’una prova de validació el dia de la convocatòria, amb un pes del 30%, i que versarà sobre les Activitats d’Avaluació Continuada realitzades. Per tal de poder obtenir la nota mitjana de l’avaluació, caldrà haver obtingut una qualificació d’un 5 en cadascuna de les parts. Su no supereu la part d’Avaluació Continuada, caldrà realitzar l’examen de l’avaluació. La nota de l’avaluació continuada serà la mitjana ponderada de cada Activitat Pràctica d’Avaluació Continuada en funció de les hores dedicades a cadascuna.
* **Examen d’avaluació** (Parcials): Si no s’opta per l’avaluació continuada o aquesta no es supera amb la nota mínima, podeu realitzar l’examen de l’avaluació, consistent en un exercici de caràcter pràctic sobre tot el temari vist fins el moment de la prova. 

En cas de no superar la prova de validació de l’avaluació continuada o l’examen d’avaluació parcial corresponent, disposareu d’un examen a final de curs. La nota del mòdul, serà doncs la nota d’aquesta prova final.

A més, disposeu d’una convocatòria extraordinària el mes de juny si no s’han superat les avaluacions anteriors. La nota del mòdul, serà doncs la nota que obtingueu en aquest examen.
