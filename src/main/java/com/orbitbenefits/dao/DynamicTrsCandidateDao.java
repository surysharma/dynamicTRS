package com.orbitbenefits.dao;

import com.orbitbenefits.domain.Candidate;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: sureshsharma
 * Date: 23/10/2011
 * Time: 10:57
 * To change this template use File | Settings | File Templates.
 */
public interface DynamicTrsCandidateDao {
    void saveCandidate(Candidate candidate);

    List<Candidate> getCandidates();
}