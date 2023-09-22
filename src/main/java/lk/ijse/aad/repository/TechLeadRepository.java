package lk.ijse.aad.repository;

import lk.ijse.aad.entity.TechLead;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechLeadRepository extends JpaRepository<TechLead,String> {
        TechLead getTechLeadsById(String id);
}
