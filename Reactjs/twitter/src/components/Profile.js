import React from 'react';
import {
    FaCalendar,
    FaMapMarkerAlt,
    FaCheckCircle,
} from "react-icons/fa";

export default function Profile(props) {
    return (
        <header className="block row center">
            <div className='main'>
                <div className='section2'>
                    <h3>Mr Bean <FaCheckCircle className="re blue" /></h3>
                    <p>2,258 Tweets</p>
                    <img src='images/cover1.jpg' alt='cover photo' width="100%" height="300px" /> <br />
                    <img src='images/profile.jpg' alt='cover photo' width="180px" height="180px" id="profilepic" />
                    <div className="create__btn followbtn">
                        <a href="" onClick={"<Post />"} >Follow</a>
                    </div>
                    <div className="posts__first__name name">
                        <strong>Mr Bean</strong> <FaCheckCircle className="re blue" />
                    </div>
                    <div className="posts__first__username username">
                        @mrbean
                    </div> <br />
                    <div className="posts__first__name name">
                        <h5>Welcome to the official Twitter account of Mr Bean, run by Mr Bean, obviously. All tweets in a Beany capacity.</h5>
                        <div className="posts__first__username">
                            <FaMapMarkerAlt className="re" /> Tiger Aspect Productions  &nbsp; &nbsp;
                            <FaCalendar className="re" /> Joined June 2010
                        </div>
                    </div>
                    <div className="posts__first__name name">
                        <h6><strong>51 </strong>Following
                            &nbsp; &nbsp; <strong>217.4K </strong>Followers</h6>
                    </div>
                </div>
            </div>
        </header>
    );
}
