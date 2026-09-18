
let content = '';
process.stdin.resume();
process.stdin.setEncoding('utf8');
process.stdin.on('data', buf => {
  content += buf;
});
process.stdin.on('end', () => {
  const [, ...lines] = content.trim().split('\n');
  const buildings = lines
    .map(line => line.split(' '))
    .reduce(
      (buildings, [b, f, r, v]) => addTenant(buildings, b, f, r, parseInt(v)),
      {}
    );

  render(buildings);
});

const render = buildings => {
  const numBuildings = 4;
  for (let i = 1; i <= numBuildings; i++) {
    renderBuilding(buildings, i.toString());
    if (i !== numBuildings) {
      console.log('#'.repeat(20));
    }
  }
};

const renderBuilding = (buildings, id) => {
  const numFloors = 3;
  for (let i = 1; i <= numFloors; i++) {
    renderFloor(buildings[id] || {}, i.toString());
  }
};

const renderFloor = (building, id) => {
  const numRooms = 10;
  if (building[id] === undefined) {
    console.log('', '0'.repeat(numRooms).split('').join(' '));
    return;
  }
  
  const floor = building[id];
  const numTenants = [];
  for (let i = 1; i <= numRooms; i++) {
    if (floor[i.toString()] === undefined) {
      numTenants.push(0);
    } else {
      numTenants.push(floor[i.toString()]);
    }
  }

  console.log('', numTenants.join(' '));
};

const setValue = (obj, [path, ...rest], val) => {
  if (rest.length === 0) {
    return Object.assign({}, obj, { [path]: val });
  } else {
    return Object.assign({}, obj, {
      [path]: setValue(obj[path] || {}, rest, val),
    });
  }
};

const getValue = (obj, [path, ...rest], val) => {
  if (rest.length === 0) {
    return obj[path] || val;
  } else {
    return obj[path] ? getValue(obj[path], rest, val) : val;
  }
};

const addTenant = (buildings, buildingId, floor, room, amount) => {
  const numTenants = getValue(buildings, [buildingId, floor, room], 0);
  return setValue(buildings, [buildingId, floor, room], amount + numTenants);
};
