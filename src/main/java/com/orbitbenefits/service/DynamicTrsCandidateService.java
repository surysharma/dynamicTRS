package com.orbitbenefits.service;

import com.orbitbenefits.domain.Candidate;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: sureshsharma
 * Date: 23/10/2011
 * Time: 10:31
 * To change this template use File | Settings | File Templates.
 */

public interface DynamicTrsCandidateService {
    void createCandidate(Candidate candidate);

    List<Candidate> getCandidates();
}
