import React from "react";

const TrendsKeyword = () => {
  const [state, setState] = React.useState([
    {
      id: 1,
      country: "Trend in India",
      keyword: "#RockyBhai",
      totalKeywords: "2000k",
    },
    {
      id: 2,
      country: "Trend in India",
      keyword: "#KGF",
      totalKeywords: "6000k",
    },
    {
      id: 3,
      country: "Trend in India",
      keyword: "MrBean",
      totalKeywords: "2560k",
    },
    {
      id: 4,
      country: "Trend in India",
      keyword: "ISRO",
      totalKeywords: "2000k",
    },
    {
      id: 5,
      country: "Trend in India",
      keyword: "#IncredibleIndia",
      totalKeywords: "2000k",
    },
  ]);
  return (
    <div className="keywords">
      <div className="key">
        <div className="keyword__heading">
          <h4>Trends for you</h4>
        </div>
        {state.map((keyword) => (
          <div key={keyword.id}>
            <div className="country">{keyword.country}</div>
            <div className="keyword__name">
              <strong>{keyword.keyword}</strong>
            </div>
            <div className="keyword__tweets">{keyword.totalKeywords}</div>
          </div>
        ))}
      </div>
    </div>
  );
};

export default TrendsKeyword;
