function monthSeason(month, days) {
    let season;
    if (['January', 'February', 'March'].includes(month)) {
        season = 'winter';
    } else if (['April', 'May', 'June'].includes(month)) {
        season = 'spring';
    } else if (['July', 'August', 'September'].includes(month)) {
        season = 'summer';
    } else {
        season = 'autumn';
    }
    if (month === 'March' && days > 19) {
        season = 'spring';
    } else if (month === 'June' && days > 20) {
        season = 'summer';
    } else if (month === 'September' && days > 21) {
        season = 'autumn';
    } else if (month === 'October' && days > 21) {
        season = 'autumn';
    } else if (month === 'November' && days > 21) {
        season = 'autumn';
    } else if (month === 'December' && days > 20) {
        season = 'winter';
    }
    return season;
}
