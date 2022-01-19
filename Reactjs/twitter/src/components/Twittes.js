import React from "react";
import CreateTweet from "./CreateTweet";
import Posts from "./Posts";
import Profile from "./Profile";
import {
  FaCheckCircle,
} from "react-icons/fa";

const Twittes = () => {
  return (
    <div className="posts">
      <div className="posts__home">
      <div className="posts__first__name">
          <strong>Mr Bean </strong> <FaCheckCircle className="re blue" />
        </div>
        <div className="posts__first__username">
        2,258 Tweets
        </div>
      </div>
      <Profile />
      <CreateTweet />
      <Posts />
      {/* <Posts />
      <Posts /> */}
    </div>
  );
};

export default Twittes;
