package fis.cis.guitar.chorder.service.api;

import fis.cis.guitar.chorder.entity.Chord;

import java.util.List;

public interface ChordService {
    Chord findById(Long id);

    List<Chord> findAll();

    Chord findByName(String name);

    Chord addChord(Chord chord);
}
