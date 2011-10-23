package com.orbitbenefits.domain;


import javax.annotation.Generated;
import javax.persistence.*;

@Entity
@Table(name="dtrs_candidate")
public class Candidate {

    @Id
    @TableGenerator(name = "seq_table", table = "GENERATOR_TABLE")
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "seq_table")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private Long id;
    private String candidateFirstName;
    private String candidateMiddleName;
    private String candidateLastName;

    @Column(name = "candidate_middle_name")
    public String getCandidateMiddleName() {
        return candidateMiddleName;
    }

    public void setCandidateMiddleName(String candidateMiddleName) {
        this.candidateMiddleName = candidateMiddleName;
    }

    @Column(name = "candidate_last_name")
    public String getCandidateLastName() {
        return candidateLastName;
    }

    public void setCandidateLastName(String candidateLastName) {
        this.candidateLastName = candidateLastName;
    }

    @Column(name = "candidate_first_name")
    public String getCandidateFirstName() {
        return candidateFirstName;
    }

    public void setCandidateFirstName(String candidateFirstName) {
        this.candidateFirstName = candidateFirstName;
    }
}
