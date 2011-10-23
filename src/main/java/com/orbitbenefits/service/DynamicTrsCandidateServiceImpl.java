package com.orbitbenefits.service;


import com.orbitbenefits.domain.Candidate;
import com.orbitbenefits.dao.DynamicTrsCandidateDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DynamicTrsCandidateServiceImpl implements DynamicTrsCandidateService {

    @Autowired
    private DynamicTrsCandidateDao dynamicTrsCandidateDao;

    @Override
    public void createCandidate(Candidate candidate) {
                  dynamicTrsCandidateDao.saveCandidate(candidate);
    }

    @Override
    public List<Candidate> getCandidates() {
        return  dynamicTrsCandidateDao.getCandidates();
        //To change body of implemented methods use File | Settings | File Templates.
    }


}
