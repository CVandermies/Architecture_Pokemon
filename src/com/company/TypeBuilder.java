package com.company;

import java.util.HashMap;

abstract class TypeBuilder {
    static HashMap<String, Double> affinity = new HashMap<>();
    static HashMap<String, HashMap<String, Double>> affinities = new HashMap<>();

    TypeBuilder() {
        affinity.put("Normal", 1.);
        affinity.put("Fighting", 1.);
        affinity.put("Flying", 1.);
        affinity.put("Poison", 1.);
        affinity.put("Ground", 1.);
        affinity.put("Rock", 1.);
        affinity.put("Bug", 1.);
        affinity.put("Ghost", 1.);
        affinity.put("Fire", 1.);
        affinity.put("Water", 1.);
        affinity.put("Grass", 1.);
        affinity.put("Electric", 1.);
        affinity.put("Psychic", 1.);
        affinity.put("Ice", 1.);
        affinity.put("Dragon", 1.);

        //Normal
        affinities.put("Normal", (HashMap)affinity.clone());
        affinities.get("Normal").put("Rock", 0.5);
        affinities.get("Normal").put("Ghost", 0.);

        //Fighting
        affinities.put("Fighting", (HashMap)affinity.clone());
        affinities.get("Fighting").put("Poison", 0.5);
        affinities.get("Fighting").put("Fying", 0.5);
        affinities.get("Fighting").put("Psychic", 0.5);
        affinities.get("Fighting").put("Bug", 0.5);
        affinities.get("Fighting").put("Normal", 2.);
        affinities.get("Fighting").put("Ice", 2.);
        affinities.get("Fighting").put("Rock", 2.);
        affinities.get("Fighting").put("Ghost", 0.);

        //Flying
        affinities.put("Flying", (HashMap)affinity.clone());
        affinities.get("Flying").put("Grass", 2.);
        affinities.get("Flying").put("Fighting", 2.);
        affinities.get("Flying").put("Bug", 2.);
        affinities.get("Flying").put("Rock", 0.5);
        affinities.get("Flying").put("Electric", 0.5);

        //Poison
        affinities.put("Poison", (HashMap)affinity.clone());
        affinities.get("Poison").put("Grass", 2.);
        affinities.get("Poison").put("Bug", 2.);
        affinities.get("Poison").put("Poison", 0.5);
        affinities.get("Poison").put("Ground", 0.5);
        affinities.get("Poison").put("Rock", 0.5);
        affinities.get("Poison").put("Ghost", 0.5);

        //Ground
        affinities.put("Ground", (HashMap)affinity.clone());
        affinities.get("Ground").put("Fire", 2.);
        affinities.get("Ground").put("Electric", 2.);
        affinities.get("Ground").put("Poison", 2.);
        affinities.get("Ground").put("Rock", 2.);
        affinities.get("Ground").put("Grass", 0.5);
        affinities.get("Ground").put("Bug", 0.5);
        affinities.get("Ground").put("Flying", 0.);

        //Rock
        affinities.put("Rock", (HashMap)affinity.clone());
        affinities.get("Rock").put("Ice", 2.);
        affinities.get("Rock").put("Flying", 2.);
        affinities.get("Rock").put("Bug", 2.);
        affinities.get("Rock").put("Fire", 2.);
        affinities.get("Rock").put("Fighting", 0.5);
        affinities.get("Rock").put("Ground", 0.5);

        //Bug
        affinities.put("Bug", (HashMap)affinity.clone());
        affinities.get("Bug").put("Grass", 2.);
        affinities.get("Bug").put("Poison", 2.);
        affinities.get("Bug").put("Psychic", 2.);
        affinities.get("Bug").put("Fire", 0.5);
        affinities.get("Bug").put("Fighting", 0.5);
        affinities.get("Bug").put("Flying", 0.5);
        affinities.get("Bug").put("Ghost", 0.5);

        //Ghost
        affinities.put("Ghost", (HashMap)affinity.clone());
        affinities.get("Ghost").put("Ghost", 2.);
        affinities.get("Ghost").put("Normal", 0.);
        affinities.get("Ghost").put("Psychic", 0.);

        //Fire
        affinities.put("Fire", (HashMap)affinity.clone());
        affinities.get("Fire").put("Fire", 0.5);
        affinities.get("Fire").put("Water", 0.5);
        affinities.get("Fire").put("Grass", 2.);
        affinities.get("Fire").put("Ice", 2.);
        affinities.get("Fire").put("Bug", 2.);
        affinities.get("Fire").put("Rock", 0.5);
        affinities.get("Fire").put("Dragon", 0.5);

        //Water
        affinities.put("Water", (HashMap)affinity.clone());
        affinities.get("Water").put("Fire", 2.);
        affinities.get("Water").put("Water", 0.5);
        affinities.get("Water").put("Grass", 0.5);
        affinities.get("Water").put("Ground", 2.);
        affinities.get("Water").put("Rock", 2.);
        affinities.get("Water").put("Dragon", 0.5);

        //Grass
        affinities.put("Grass", (HashMap)affinity.clone());
        affinities.get("Grass").put("Fire", 0.5);
        affinities.get("Grass").put("Grass", 0.5);
        affinities.get("Grass").put("Poison", 0.5);
        affinities.get("Grass").put("Flying", 0.5);
        affinities.get("Grass").put("Bug", 0.5);
        affinities.get("Grass").put("Dragon", 0.5);
        affinities.get("Grass").put("Water", 2.);
        affinities.get("Grass").put("Ground", 2.);
        affinities.get("Grass").put("Rock", 2.);

        //Electric
        affinities.put("Electric", (HashMap)affinity.clone());
        affinities.get("Electric").put("Grass", 0.5);
        affinities.get("Electric").put("Electric", 0.5);
        affinities.get("Electric").put("Dragon", 0.5);
        affinities.get("Electric").put("Water", 2.);
        affinities.get("Electric").put("Flying", 2.);
        affinities.get("Electric").put("Ground", 0.);

        //Psychic
        affinities.put("Psychic", (HashMap)affinity.clone());
        affinities.get("Psychic").put("Poison", 2.);
        affinities.get("Psychic").put("Fighting", 2.);
        affinities.get("Psychic").put("Psychic", 0.5);

        //Ice
        affinities.put("Ice", (HashMap)affinity.clone());
        affinities.get("Ice").put("Water", 0.5);
        affinities.get("Ice").put("Ice", 0.5);
        affinities.get("Ice").put("Grass", 2.);
        affinities.get("Ice").put("Ground", 2.);
        affinities.get("Ice").put("Flying", 2.);
        affinities.get("Ice").put("Dragon", 2.);

        //Dragon
        affinities.put("Dragon", (HashMap)affinity.clone());
        affinities.get("Dragon").put("Dragon", 2.);
    }

//    private void createType(String name, HashMap<String, Double> offensive, HashMap<String, Double> defensive) {
//        affinities.put(name, offensive);
//
//        for (String defName : defensive.keySet()) {
//            for (String nameType : affinities.keySet()) {
//                if (defName == nameType) {
//                    affinities.get(nameType).put(name, defensive.get(nameType));
//                }
//            }
//        }
//    }

}
