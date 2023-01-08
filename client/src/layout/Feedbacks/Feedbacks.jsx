import feedbackCommentImage from '../../assets/img/feedback-comment.svg';
import './Feedbacks.css';

export function Feedbacks() {
  return (
    <section className="feedbacks">
      <div className="row feedbacks__content">
        <img className="feedbacks__icon" src={feedbackCommentImage} />
        <div className="feedback">
          <h1 className="feedback__comment">A melhor babearia da cidade!</h1>
          <p className="feedback__costumer">Fulano de tal</p>
        </div>
      </div>
    </section>
  );
}
