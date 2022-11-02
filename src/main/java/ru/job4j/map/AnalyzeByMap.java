package ru.job4j.map;

import java.util.*;
import java.util.stream.Collectors;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        double sumScore = 0;
        double temp = 0;

        for (Pupil pupil : pupils) {
            sumScore += (pupil.getSubjects().stream().map(Subject::getScore).reduce(0,
                    Integer::sum) /(double) pupil.getSubjects().size());
        }
        return sumScore / pupils.size();
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        double sumScore = 0;

        for (Pupil pupil : pupils) {
            sumScore = pupil.getSubjects().stream().map(Subject::getScore).reduce(0,
                    Integer::sum);
            labels.add(new Label(pupil.getName(), sumScore / pupil.getSubjects().size()));
        }
        return labels;
    }


    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Record> labels = new HashMap<>();

        for (Pupil pupil : pupils) {
            for (Subject subj : pupil.getSubjects()) {
                labels.computeIfPresent(subj.getName(), (a, b) -> b = new Record(b.getSubjCount() + 1
                        , b.getScore() + subj.getScore()));
                labels.putIfAbsent(subj.getName(), new Record(1, subj.getScore()));
            }
        }
        return labels.keySet().stream()
                .map(k -> new Label(k, labels.get(k).getScore() / labels.get(k).getSubjCount()))
                .collect(Collectors.toList());
    }

    public static Label bestStudent(List<Pupil> pupils) {

        return pupils.stream()
                .map(pupil -> new Label(pupil.getName(),
                        pupil.getSubjects().stream()
                                .map(Subject::getScore)
                                .reduce(0,Integer::sum)))
                .sorted((o1, o2) -> o2.compareTo(o1))
                .findFirst().get();
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> labels = new HashMap<>();
        LinkedHashMap bestSubj;
        String sKey;

        for (Pupil pupil : pupils) {
            for (Subject subj : pupil.getSubjects()) {
                labels.computeIfPresent(subj.getName(), (a, b) -> b += subj.getScore());
                labels.putIfAbsent(subj.getName(), subj.getScore());
            }
        }
        bestSubj = labels.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        sKey = (String) bestSubj.keySet().stream().findFirst().get();

        return new Label(sKey, labels.get(sKey));
    }

    public static class Record implements Comparable<Record> {
        int subjCount;
        double score;

        public Record(int subjCount, double score) {
            this.subjCount = subjCount;
            this.score = score;
        }

        public int getSubjCount() {
            return subjCount;
        }

        public double getScore() {
            return score;
        }

        public void setScore(double score) {
            this.score = score;
        }

        @Override
        public int compareTo(Record o) {
            return 0;
        }
    }
}
