package com.sethanantp.sfgpetclinic.services;

import com.sethanantp.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastname);
}
