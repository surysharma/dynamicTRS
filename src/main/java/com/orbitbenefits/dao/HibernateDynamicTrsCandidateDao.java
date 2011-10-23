package com.orbitbenefits.dao;

import com.orbitbenefits.domain.Candidate;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: sureshsharma
 * Date: 23/10/2011
 * Time: 11:00
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class HibernateDynamicTrsCandidateDao implements DynamicTrsCandidateDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void saveCandidate(Candidate candidate) {
        sessionFactory.getCurrentSession().saveOrUpdate(candidate);
    }

    @Override
    public List<Candidate> getCandidates() {
        return null;
    }
}
