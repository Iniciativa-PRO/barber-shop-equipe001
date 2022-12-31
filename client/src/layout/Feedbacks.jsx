import feedbackComment from '../assets/img/feedback-comment.svg';
import '../assets/style/Feedbacks.css';

export function Feedbacks() {
  return (
    <div className="feedbacks">
      <div className="row feedbacks__content">
        <img className="feedbacks__icon" src={feedbackComment} />
        <div className="feedback">
          <h1 className="feedback__comment">A melhor babearia da cidade!</h1>
          <p className="feedback__costumer">Fulano de tal</p>
        </div>
      </div>
    </div>
  );
}
