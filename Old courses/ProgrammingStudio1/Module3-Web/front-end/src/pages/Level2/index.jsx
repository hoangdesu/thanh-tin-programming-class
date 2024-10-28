import React, { useState } from "react";
import World from "./World";
import Country from "./Country";
import States from "./States";
import Cities from "./Cities";

const Level2 = () => {
  const tabs = ["🌏 World", "⛰️ Country"];
  // , "States", "Cities"];
  const [selectedTab, setSelectedTab] = useState(tabs[0]);

  return (
    <div className="">
      <h4 className="text-center mt-16">View data by</h4>
      <ul className="text-white flex flex-row w-full justify-evenly items-center text-xl my-16">
        {tabs.map((t) => (
          <li
            key={t}
            className={`py-4 px-32 ${
              t === selectedTab ? "bg-orange-700" : "bg-orange-400"
            } rounded-xl hover:cursor-pointer hover:bg-orange-500 transition duration-200`}
            onClick={() => setSelectedTab(t)}
          >
            {t}
          </li>
        ))}
      </ul>

      {selectedTab === tabs[0] && <World />}
      {selectedTab === tabs[1] && <Country />}
      {/* {selectedTab === tabs[2] && <States />}
      {selectedTab === tabs[3] && <Cities />} */}
    </div>
  );
};

export default Level2;
