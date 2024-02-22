package springbootlibrary.librarybackend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import springbootlibrary.librarybackend.entity.Book;

public interface BookDao extends JpaRepository<Book, Long>,BookDaoCustom {

}
