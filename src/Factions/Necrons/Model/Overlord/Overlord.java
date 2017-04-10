package Factions.Necrons.Model.Overlord;

import Factions.Necrons.Base.NecronModel;

/**
 * Created by jnebl on 4/10/2017.
 */
public class Overlord extends NecronModel{
    public Overlord(){
        super(5,5,5,5,3,2,3,10,3,"Overlord","When a Necron " +
                "Overlord strides forth in his raiment of war, whole worlds quake in terror at\n" +
                "his tread. His armoured form is proof against tank-busting weaponry, and his metal sinews\n" +
                "have might enough to crush bones to powder. At his command are all the arcane armaments\n" +
                "of his ancient civilisation – powerful artefacts that predate many of the galaxy’s greatest\n" +
                "civilizations. He commands legion upon legion of deathless foot soldiers supported by fleets\n" +
                "of arcane war engines, whose only purpose is to obey his every command.\n" +
                "Where biotransference reduced the lower ranks of Necrontyr society to mindless automata,\n" +
                "the same process raised the nobility up as cold, calculating demigods of war. Most terrifying\n" +
                "of all are the Necron Overlords – beings that hold power in excess even of the Lords that\n" +
                "serve them. Such figureheads rule not just worlds, but whole star systems. Their metallic\n" +
                "forms are accordingly of an even higher quality, and they possess a strength, resilience, and\n" +
                "intellect that few mortals can match.",80);
        setHq(true);
        setInfantry(true);
        setCharacters(true);
        setIndependentCharacter(true);
        setReanimationProtocols(true);
    }
}
