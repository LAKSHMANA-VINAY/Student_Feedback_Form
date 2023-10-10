import React from 'react';

class MainForm extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      ratings: [0, 0, 0, 0, 0],
      comment: '', 
    };
  }

  handleRatingChange = (index, value) => {
    const { ratings } = this.state;
    ratings[index] = value;
    this.setState({ ratings });
  };

  handleCommentChange = (comment) => {
    this.setState({ comment });
  };

  handleSubmit = (event) => {
    //event.preventDefault();
    const {ratings,comment}=this.state;
    const data={ratings,comment};
    //console.log('Form submitted:', this.state.ratings, this.state.comment);
    this.props.onChildData(data)
  };

  render() {
    const { ratings, comment } = this.state;

    return (
      <div>
        <h2>Feedback Form</h2>
        <form onSubmit={this.handleSubmit}>
          {Array.from({ length: 5 }, (_, index) => (
            <div key={index}>
              <h4>Question {index + 1}</h4>
              <div>
                <label htmlFor={`rating${index}`}>Rating:</label>
                <div>
                  {[1, 2, 3, 4, 5].map((value) => (
                    <label key={value}>
                      <input
                        type="radio"
                        name={`rating${index}`}
                        value={value}
                        checked={ratings[index] === value}
                        onChange={() =>
                          this.handleRatingChange(index, value)
                        }
                      />
                      {value}
                    </label>
                  ))}
                </div>
              </div>
            </div>
          ))}
          <div>
            <label htmlFor="comment">Comment:</label>
            <textarea
              id="comment"
              value={comment}
              onChange={(e) => this.handleCommentChange(e.target.value)}
            ></textarea>
          </div>
          <button type="submit">Submit</button>
        </form>
      </div>
    );
  }
}

export default MainForm;
