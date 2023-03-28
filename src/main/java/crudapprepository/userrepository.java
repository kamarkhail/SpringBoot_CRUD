package crudapprepository;

import org.springframework.data.jpa.repository.JpaRepository;

import crudappentity.userentity;

public interface userrepository extends JpaRepository<userentity, Long>{

}
