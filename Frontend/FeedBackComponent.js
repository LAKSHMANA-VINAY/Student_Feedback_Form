import React from "react";
class FeedBackComponent extends React.Component {
    constructor(props) {
      super(props);
      this.state = {
        formData: Array.from({ length: 5 }, () => ({
          comment: '',
          questions: Array.from({ length: 5 }, () => ({ rating: '' })),
        })),
      };
    }
  
    handleSubjectRadioChange = (subjectIndex, value) => {
      this.setState((prevState) => {
        const updatedFormData = [...prevState.formData];
        updatedFormData[subjectIndex].rating = value;
        return { formData: updatedFormData };
      });
    };
  
    handleQuestionRadioChange = (subjectIndex, questionIndex, value) => {
      this.setState((prevState) => {
        const updatedFormData = [...prevState.formData];
        updatedFormData[subjectIndex].questions[questionIndex].rating = value;
        return { formData: updatedFormData };
      });
    };
  
    handleCommentChange = (subjectIndex, value) => {
      this.setState((prevState) => {
        const updatedFormData = [...prevState.formData];
        updatedFormData[subjectIndex].comment = value;
        return { formData: updatedFormData };
      });
    };
  
    handleSubmit = (event) => {
      event.preventDefault(); // Prevent form submission from refreshing the page
      console.log('Form Data:', this.state.formData);
      this.state.formData.map(e=>console.log(e.questions[0]))
    };
  
    render() {
      const subjects = ['Math', 'Science', 'English', 'History', 'Geography'];
      const iterations = 5; // Number of questions per subject
  
      return (
        <div>
          <form onSubmit={this.handleSubmit}>
            {subjects.map((subject, subjectIndex) => (
              <div key={subjectIndex}>
                <h1>{subject}</h1>
                <div>
                  <label htmlFor={`rating-${subjectIndex}`}>Subject Rating:</label>
                  {[1, 2, 3, 4, 5].map((rating) => (
                    <label key={rating}>
                      <input
                        type="radio"
                        name={`rating-${subjectIndex}`}
                        value={rating}
                        checked={this.state.formData[subjectIndex].rating === rating}
                        onChange={() => this.handleSubjectRadioChange(subjectIndex, rating)}
                      />
                      {rating}
                    </label>
                  ))}
                </div>
                {Array.from({ length: iterations }, (_, questionIndex) => (
                  <div key={questionIndex}>
                    <h2>Question {questionIndex + 1}</h2>
                    <div>
                      <label htmlFor={`rating-${subjectIndex}-${questionIndex}`}>
                        Rating:
                      </label>
                      {[1, 2, 3, 4, 5].map((rating) => (
                        <label key={rating}>
                          <input
                            type="radio"
                            name={`rating-${subjectIndex}-${questionIndex}`}
                            value={rating}
                            checked={
                              this.state.formData[subjectIndex].questions[questionIndex].rating === rating
                            }
                            onChange={() =>
                              this.handleQuestionRadioChange(subjectIndex, questionIndex, rating)
                            }
                          />
                          {rating}
                        </label>
                      ))}
                    </div>
                  </div>
                ))}
                <div>
                  <label htmlFor={`comment-${subjectIndex}`}>Subject Comment:</label>
                  <textarea
                    id={`comment-${subjectIndex}`}
                    value={this.state.formData[subjectIndex].comment}
                    onChange={(e) =>
                      this.handleCommentChange(subjectIndex, e.target.value)
                    }
                    rows="4"
                    cols="50"
                  />
                </div>
              </div>
            ))}
            <button type="submit">Submit</button>
          </form>
        </div>
      );
    }
  }
  export default FeedBackComponent;
  