"use client";

import moment from "moment";
import * as React from "react";
import { useState } from "react";
import { getFirstDate, useOutsideClick } from "../../utils";
import { CalendarCanvas } from "./CalendarCanvas";
import { CInput } from "./CalendarComponents";


type WindowsLength = "MINUTES_5" | "HOURS_2" | "DAYS_1"
type WindowsLengthLabels = {
  [key in WindowsLength]: string;
};
const WINDOWS_LENGHT_LABELS: WindowsLengthLabels = {
  MINUTES_5: "5 minutes",
  HOURS_2: "2 hours",
  DAYS_1: "1 day"
}

interface CalendarProps {
  type: WindowsLength;
  changeWindowsLenght: (type: WindowsLength) => void;
  lastDate: Date;
  changeLastDate: (date: Date) => void;
  noWindows: number;
  changeNoWindows: (n: number) => void;
}

export function Calendar({
  type,
  changeWindowsLenght,
  lastDate,
  changeLastDate,
  noWindows,
  changeNoWindows,
}: CalendarProps) {
  const [startDt, setStartDT] = useState<Date | undefined>(
    getFirstDate(lastDate, type, noWindows)
  );
  const [endDt, setEndDT] = useState<Date | undefined>(lastDate);
  const [showCalendar, setShowCalendar] = useState<boolean>(false);
  const [showWL, setShowWL] = useState<boolean>(false);

  const setTypeHandler = (
    e: React.MouseEvent<HTMLDivElement>,
    windowLength: WindowsLength
  ) => {
    e.stopPropagation();
    changeWindowsLenght(windowLength);
    setShowWL(false);
  };
  const setShowWLHandler = () => {
    setShowWL((prev) => !prev);
    setShowCalendar(false);
  };
  const setShowCalendarHandler = () => {
    setShowCalendar((prev) => !prev);
    setShowWL(false);
  };
  const setStartDTHandler = (date?: Date) => {
    setStartDT(date);
  };
  const setEndDTHandler = (date?: Date) => {
    setEndDT(date);
  };
  // handler that will close the dropdown menu when the user clicks on different part of the page.
  const handleOutsideClick = () => {
    setShowWL(false);
  };
  // handler that will close the calendar when the user clicks outside of it
  const handleOutsideCalendarClick = () => {
    setShowCalendar(false);
  };

  const onApply = () => {
    let diff = 0;
    const endDte = endDt ? endDt : moment(startDt).endOf("day").toDate();

    if (type === "DAYS_1") {
      diff = moment(endDte).diff(moment(startDt), "days");
      diff = diff + 1;
    } else if (type === "HOURS_2") {
      diff = moment(endDte).diff(moment(startDt), "hours");
      diff = Math.ceil(diff / 2);
    } else {
      diff = moment(endDte).diff(moment(startDt), "minutes");
      diff = Math.ceil(diff / 5);
    }
    changeNoWindows(diff > 1500 ? 1500 : diff);
    changeLastDate(endDte || lastDate);
    setShowCalendar(false);
  };

  // ref used to locate the ancestor Ref so the handler doesn't reopen the dropdown
  const ancestorOutsideClickRef = React.useRef<HTMLDivElement>(null);
  // anchor element that triggers handler when is not clicked.
  const outsideClickRef = useOutsideClick(
    handleOutsideClick,
    ancestorOutsideClickRef
  );

  // ref used to locate the ancestor Ref so the handler doesn't reopen the calendar
  const ancestorOutsideCalendarClickRef = React.useRef<HTMLDivElement>(null);
  // anchor element that triggers handler when is not clicked.
  const outsideCalendarClickRef = useOutsideClick(
    handleOutsideCalendarClick,
    ancestorOutsideCalendarClickRef
  );

  return (
    <div className=" metricsCalendar">
      <div className="controls" ref={ancestorOutsideClickRef}>
        <CInput label="WINDOW LENGTH:" onClick={setShowWLHandler}>
          {showWL ? (
            <div className="placeholder">Select one</div>
          ) : (
            <div className="text">{WINDOWS_LENGHT_LABELS[type]}</div>
          )}
          <span className="material-icons">expand_more</span>
          {showWL ? (
            <div className="float" ref={outsideClickRef}>
              {(Object.keys(WINDOWS_LENGHT_LABELS) as WindowsLength[]).map((w) => (
                <div
                  className="option"
                  key={w}
                  onClick={(e) => {
                    setTypeHandler(e, w);
                  }}
                >
                  {WINDOWS_LENGHT_LABELS[w]}
                </div>
              ))}
            </div>
          ) : null}
        </CInput>

        <CInput label="TIME RANGE:">
          <div
            className="inputWrapper"
            onClick={setShowCalendarHandler}
            ref={ancestorOutsideCalendarClickRef}
          >
            {!startDt ? (
              <div className="placeholder">Select date and time</div>
            ) : (
              <>
                {Boolean(startDt) && !endDt ? (
                  <div className="color-mild-light">
                    <span className="text-white">
                      {moment(startDt).format(
                        `MMM DD ${type === "HOURS_2" ? "HH:00" : ""} ${
                          type === "MINUTES_5" ? "HH:mm" : ""
                        } `
                      )}
                    </span>
                  </div>
                ) : (
                  <div className="color-mild-light">
                    from{` `}
                    <span className="text-white">
                      {moment(startDt).format(
                        `MMM DD ${type === "HOURS_2" ? "HH:00" : ""} ${
                          type === "MINUTES_5" ? "HH:mm" : ""
                        } `
                      )}
                    </span>
                    to{` `}
                    <span className="text-white">
                      {moment(endDt).format(
                        `MMM DD ${type === "HOURS_2" ? "HH:00" : ""} ${
                          type === "MINUTES_5" ? "HH:mm" : ""
                        }`
                      )}
                    </span>
                  </div>
                )}
              </>
            )}
            <span className="material-icons">expand_more</span>
            <span className="material-icons-outlined">calendar_month</span>
          </div>
          {showCalendar ? (
            <CalendarCanvas
              lastDate={lastDate}
              onApply={onApply}
              outsideCalendarClickRef={outsideCalendarClickRef}
              setEndDT={setEndDTHandler}
              setStartDT={setStartDTHandler}
              type={type}
            />
          ) : null}
        </CInput>
      </div>
    </div>
  );
}
