package ua.lviv.iot.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.domain.Plane;

@Repository
public interface PlaneRepository extends JpaRepository<Plane, Integer> {
    @Procedure("get_max_passengers")
    int getMaxPassengers();
}
