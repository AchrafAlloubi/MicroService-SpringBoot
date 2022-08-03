package org.sid.compteservice.entities;


import org.springframework.data.rest.core.config.Projection;

@Projection(name = "p1", types = Compte.class)
public interface CompteProjection1 {

    Long getCode();
    double getSolde();
}
