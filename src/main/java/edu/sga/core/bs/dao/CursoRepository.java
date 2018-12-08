package edu.sga.core.bs.dao;

import edu.sga.core.eis.bo.Curso;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface
CursoRepository  extends PagingAndSortingRepository<Curso,Long> {
}
