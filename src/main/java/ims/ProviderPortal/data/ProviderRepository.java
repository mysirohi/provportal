package ims.ProviderPortal.data;

import org.springframework.data.jpa.repository.JpaRepository;

import ims.ProviderPortal.model.*;

public interface ProviderRepository extends JpaRepository<Provider, Long> {

}