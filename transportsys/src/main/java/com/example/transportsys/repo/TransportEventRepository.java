
package com.example.transportsys.repo;

import com.example.transportsys.model.TransportEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransportEventRepository extends JpaRepository<TransportEvent, Long> {
}
