package com.sethanantp.sfgpetclinic.services;

import com.sethanantp.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByLastName(String lastname);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
