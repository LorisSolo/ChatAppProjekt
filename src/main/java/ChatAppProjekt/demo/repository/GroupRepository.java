package ChatAppProjekt.demo.repository;

import ChatAppProjekt.demo.model.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository<Group, Integer> {
    Group getGroupById(String groupId);
}
