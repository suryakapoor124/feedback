package repository;

import model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRespository extends JpaRepository<Feedback,Long> {
}
